import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Fetcher {

    String content;

    //getter and setter methods
    public String getContent()
    {
        return content;
    }
    void setContent(String website)
    {
        content=readContent(website);
    }

    //using jsoup to extract data
    public String readContent(String page){

        Connection conn = Jsoup.connect(page);
        //executing the get request
        Document doc = null;
        try {
            doc = conn.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Retrieving the contents (body) of the web page
        String result;
        result = doc != null ? doc.body().text() : null;
        return result;
    }
}
