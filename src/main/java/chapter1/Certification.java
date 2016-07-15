package chapter1;

/**
 * Created by Sandeep Dongapure on 15-07-2016.
 */
public class Certification {

    private String name;
    private String version;

    /*
    Multi line comment
     */
    public String getName() {
        return name;
    }

    /*//simple setter*/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Javadoc type comment
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
