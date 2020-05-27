package labs_examples.packages.labs.sub_labs_one;


import labs_examples.packages.labs.sub_labs_two.SubLabsTwo;

public class SubLabsOne {
        public static void main(String[] args) {
            SubLabsTwo objTwo = new SubLabsTwo();
            objTwo.sayHello();
            //objTwo.donotSayHello();

            SubLabsOne objOne = new SubLabsOne();
            objOne.sayHelloFromOne();
            objOne.protectedFromTwo();
        }
        public void sayHelloFromOne() {
            System.out.println("Saying hello from ONE");
        }

        protected void protectedFromTwo() {
            System.out.println("Lockdown in ONE!");
        }

}
