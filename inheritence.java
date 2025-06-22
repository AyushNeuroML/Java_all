public class inheritence {

    public static class Parent {
        public void display() {
            System.out.println("This is the parent class.");
        }
    }
    public static class Child extends Parent {
        @Override
        public void display() {
            System.out.println("This is the child class.");
        }
    }
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.display();
        
        }
    }
    

