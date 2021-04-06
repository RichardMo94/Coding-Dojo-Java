import java.util.HashMap;
import java.util.Set;

public class HashMapSongs {
    public static void main(String[] args){
        HashMap <String, String> trackList = new HashMap <String, String>();
        trackList.put("Dani California", "Getting born in the state of Mississippi Papa was a copper, and her mama was a hippy");
        trackList.put("Demons", "When the days are cold and the cards all fold And the saints we see are all made of gold");
        trackList.put("Calling me", "I swallow the wind through my nose feel the sand beneath my toes as i walk along the shore");
        trackList.put("Snow", "Come to decide that the things that I tried Were in my life just to get high on");

        String lyrics = trackList.get("Demons");
        System.out.println("The song lyrics are: " + lyrics);

        // Iterate through the songs
        Set<String> keys = trackList.keySet();
        for(String key: keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}