package generic;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

/**
 * Created by mkaleem on 7/11/14.
 */
public class Properties {
        public void properties(String fileName) throws Exception {
        URL url = this.getClass().getResource(fileName);
        File file = new File(url.getFile());
        FileInputStream fis = new FileInputStream(file);
        java.util.Properties prop = new java.util.Properties();
        prop.load(fis);

    }
}
