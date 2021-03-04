
public class Program {

    public static void main(String[] args) {
        DictionaryOfManyTranslations dt = new DictionaryOfManyTranslations();

        dt.add("mother", "Ema");
        dt.add("mother", "Emme");

        System.out.println(dt.translate("mother"));

        System.out.println(dt.translate("monkey"));

    }
}
