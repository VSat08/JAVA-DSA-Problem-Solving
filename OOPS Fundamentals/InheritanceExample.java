
class Insect {

    int numberOfLegs;

    public Insect(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void says() {
        System.out.println("........");
    }

    public void crawl() {
        System.out.println("Insect Crawling");
    }
}

class Spider extends Insect {

    boolean isPoisonous;

    public Spider(boolean isPoisonous) {
        super(8);
        this.isPoisonous = isPoisonous;
    }

    public void says() {
        System.out.println("Hiss");

    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Insect insect = new Insect(6);

        Spider spider = new Spider(true);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        System.out.println(spider.numberOfLegs);
    }
}
