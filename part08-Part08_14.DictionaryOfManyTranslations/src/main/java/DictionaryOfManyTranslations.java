
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Objects;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());

        this.dictionary.get(word).add(translation);

    }

    public ArrayList<String> translate(String word) {

        return this.dictionary.getOrDefault(word, new ArrayList<>());

    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.dictionary);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DictionaryOfManyTranslations other = (DictionaryOfManyTranslations) obj;
        if (!Objects.equals(this.dictionary, other.dictionary)) {
            return false;
        }
        return true;
    }

}
