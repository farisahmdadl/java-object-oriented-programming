package application;

import data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld(){
            public void sayHello() {
                System.out.println("Hello");
            }
            public void sayHello(String name) {
                System.out.println("Hello" + " " + name);
            }
        };

        HelloWorld japanese = new HelloWorld(){
            public void sayHello() {
                System.out.println("こんにちは");
            }
            public void sayHello(String name) {
                System.out.println("こんにちは" + " " + name);
            }
        };

        english.sayHello();
        english.sayHello("Faris");
        japanese.sayHello();
        japanese.sayHello("ファリス");
    }
}
