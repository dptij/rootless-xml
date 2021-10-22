import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.junit.Test;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;

public class XmlParsingTest {
    @Test
    public void test() throws IOException, SAXException {
        final DOMParser parser = new DOMParser();
        final String xml = "<LetsGoBrandon></LetsGoBrandon><LetsGoBrandon></LetsGoBrandon>";
        parser.parse(new InputSource(new StringReader(xml)));
    }

}
