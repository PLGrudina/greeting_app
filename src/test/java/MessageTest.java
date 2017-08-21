import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * Created by PavelGrudina on 21.08.2017.
 */
public class MessageTest {

    Message message = new Message();

    @Test
    public void getMessageTest() {
        Assert.assertNotNull(message.getMessage());
        Locale.setDefault(Locale.ENGLISH);
        Assert.assertNotNull(message.getMessage());
    }

    @Test
    public void timingTestRU() {
        Locale.setDefault(Locale.forLanguageTag("ru"));
        message.setTimeNow(7);
        Assert.assertEquals("Доброе утро, Мир!", message.getMessage());

        message.setTimeNow(11);
        Assert.assertEquals("Добрый день, Мир!", message.getMessage());

        message.setTimeNow(20);
        Assert.assertEquals("Добрый вечер, Мир!", message.getMessage());

        message.setTimeNow(0);
        Assert.assertEquals("Доброй ночи, Мир!", message.getMessage());
    }

    @Test
    public void timingTestEN() {
        Locale.setDefault(Locale.ENGLISH);
        message.setTimeNow(7);
        Assert.assertEquals("Good morning, World!", message.getMessage());

        message.setTimeNow(11);
        Assert.assertEquals("Good day, World!", message.getMessage());

        message.setTimeNow(20);
        Assert.assertEquals("Good evening, World!", message.getMessage());

        message.setTimeNow(0);
        Assert.assertEquals("Good night, World!", message.getMessage());
    }


}
