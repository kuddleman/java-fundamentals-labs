package labs_examples.play_area;

public class play {
    public static void main(String[] args) {
        System.out.println(printOut());
    }

    public static String printOut() {

        return "printOut() called!";
    }
}
                                        class Main {
  public static void main(String[] args) {

    AccessMod obj = new AccessMod();

    // try to set each instance var on the "obj" object
    // hint - only two will work
  }
}

class AccessMod {

  public String publicVar;
  protected String protectedVar;
  private String privateVar;

}