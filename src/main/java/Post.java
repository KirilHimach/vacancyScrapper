public class Post {

    private String vacancyCardDate;
    private String vacancyCardLink;
    private String vacancyCardCompanyTitle;
    private String vacancyCardTitle;
    private String vacancyCardSalary;
    private String vacancyCardSkills;



    @Override
    public String toString() {
        return "Post{" +
                " vacancyCardDate='" + vacancyCardDate + '\'' +
                ", vacancyCardLink='" + vacancyCardLink + '\'' +
                ", vacancyCardCompany='" + vacancyCardCompanyTitle + '\'' +
                ", vacancyCardTitle='" + vacancyCardTitle + '\'' +
                ", vacancyCardSalary='" + vacancyCardSalary + '\'' +
                ", vacancyCardSkills='" + vacancyCardSkills + '\'' +
                '}';
    }

    public void setVacancyCardDate(String vacancyCardDate) {
        this.vacancyCardDate = vacancyCardDate;
    }

    public void setVacancyCardLink(String vacancyCardLink) {
        this.vacancyCardLink = vacancyCardLink;
    }

    public void setVacancyCardCompanyTitle(String vacancyCardCompanyTitle) {
        this.vacancyCardCompanyTitle = vacancyCardCompanyTitle;
    }

    public void setVacancyCardTitle(String vacancyCardTitle) {
        this.vacancyCardTitle = vacancyCardTitle;
    }

    public void setVacancyCardSalary(String vacancyCardSalary) {
        this.vacancyCardSalary = vacancyCardSalary;
    }

    public void setVacancyCardSkills(String vacancyCardSkills) {
        this.vacancyCardSkills = vacancyCardSkills;
    }

    public String getVacancyCardDate() {
        return vacancyCardDate;
    }

    public String getVacancyCardLink() {
        return vacancyCardLink;
    }

    public String getVacancyCardCompanyTitle() {
        return vacancyCardCompanyTitle;
    }

    public String getVacancyCardTitle() {
        return vacancyCardTitle;
    }

    public String getVacancyCardSalary() {
        return vacancyCardSalary;
    }

    public String getVacancyCardSkills() {
        return vacancyCardSkills;
    }
}
