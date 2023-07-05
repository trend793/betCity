package elements;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomElements {

    public static String login(){
        return RandomStringUtils.randomAlphabetic(5,10);
    }
}
