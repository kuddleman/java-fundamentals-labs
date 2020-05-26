package labs_examples.static_nonstatic.labs;

/**
 * Please create two classes that demonstrate the following:

 * 8) A non-static method calling a static method in another class
 */

public class ClassOne {

  public static void main(String[] args) {

      //1) A static method calling another static method in the same class
      classOneStatic2();

      // 2) A static method calling a non-static method in the same class
      ClassOne classOneObj = new ClassOne();
      classOneObj.classOneNonStatic();

      //  3) A static method calling a static method in another class
      callStaticInAnotherClass();

      //  4) A static method calling a non-static method in another class
      staticMethodCalltoNonStaticInAnotherClass();

      //  5) A non-static method calling a non-static method in the same class
      classOneObj.anotherClassOneNonStatic();

      // 6) A non-static method calling a non-static method in another class
      classOneObj.callingAnotherNonStaticMethodInAnotherClass();

      //7) A non-static method calling a static method in the same class
      classOneObj.nonStaticCallingStaticInSameClass();

  }

  public static void classOneStatic() {
      System.out.println("This is ClassOne's STATIC method");
  }

  public static void classOneStatic2() {
      classOneStatic();
  }

  public static void callStaticInAnotherClass() {
      ClassTwo.classTwoStatic();
  }

  public static void staticMethodCalltoNonStaticInAnotherClass() {
      ClassTwo anotherClass2 = new ClassTwo();
      anotherClass2.classTwoNonStatic();
  }

  public void classOneNonStatic() {
      System.out.println("This is ClassOne's NON-STATIC method");
  }

  public void anotherClassOneNonStatic() {
      classOneNonStatic();
  }

  public void callingAnotherNonStaticMethodInAnotherClass() {
      ClassTwo classTwoObj = new ClassTwo();
      classTwoObj.classTwoNonStatic();
  }

  public void nonStaticCallingStaticInSameClass() {
      classOneStatic();
  }

}
