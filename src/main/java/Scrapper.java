import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Locale;


public class Scrapper {

    private String inputURL;

    public Scrapper(String inputURL) {
        this.inputURL = inputURL;
    }

    public void searchVacancy() {

        int z = 1;
        try {
            for (int pageCount = 1; pageCount <= 5; pageCount++) {
                Document document = Jsoup.connect(inputURL + "?page=" + pageCount).get();
                Elements elements = document.getElementsByClass("vacancy-card");
                for (Element q : elements) {
                    if (q.getElementsByClass("vacancy-card__title").text().toLowerCase(Locale.ROOT).contains("java")) {
                        System.out.printf("%s.%s", pageCount, z);
                        Post post = new Post();
                        post.setVacancyCardCompanyTitle(q.getElementsByClass("vacancy-card__company-title").text());
                        post.setVacancyCardDate(q.getElementsByClass("vacancy-card__date").text());
                        post.setVacancyCardSalary(q.getElementsByClass("vacancy-card__salary").text());
                        post.setVacancyCardSkills(q.getElementsByClass("vacancy-card__skills").text());
                        post.setVacancyCardTitle(q.getElementsByClass("vacancy-card__title").text());
                        String hrefBox = q.getElementsByClass("vacancy-card__icon-link").attr("href");
                        if (!hrefBox.startsWith("https:")) {
                            int index = inputURL.indexOf("/vacancies");
                            post.setVacancyCardLink(inputURL.substring(0, index) +
                                    q.getElementsByClass("vacancy-card__icon-link").attr("href"));
                        } else {
                            post.setVacancyCardLink(q.getElementsByClass("vacancy-card__icon-link").attr("href"));
                        }
                        System.out.println();
                        System.out.println(post.getVacancyCardCompanyTitle());
                        System.out.println(post.getVacancyCardDate());
                        System.out.println(post.getVacancyCardSalary());
                        System.out.println(post.getVacancyCardSkills());
                        System.out.println(post.getVacancyCardTitle());
                        System.out.println(post.getVacancyCardLink());

                        System.out.println("-----------------");
                        z++;

                        InsertToDatabase insert = new InsertToDatabase(post);
                        insert.insertPostToDatabase();

                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
