public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        jungleDVD = returnFirst(cinderellaDVD, cinderellaDVD=jungleDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }
    public static DigitalVideoDisc returnFirst(DigitalVideoDisc x, DigitalVideoDisc y) {
        return x;
    }
    public static void _swap(Object [] os ){
        Object tmp = os[0];
        os[0] = os[1];
        os[1] = tmp;
    }
    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
        DigitalVideoDisc os[] = new DigitalVideoDisc[]{o1, o2};
        _swap(os);
        o1 = os[1];
        o2 = os[0];
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
