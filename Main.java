public class Main {

    public static void main(String[] args) {
        Book b = new Book("The jungle book",10,"Rudyard Kipling");
        System.out.println("The price before discount: "+b.getPrice());
        System.out.println("After: "+b.getDiscount());
        System.out.println("--------");
        Movie m = new Movie("Batman",100,"Matt reeves");
        System.out.println("The price before discount: "+m.getPrice());
        System.out.println("After: "+m.getDiscount());


        System.out.println("----MovablePoint----");

        MovablePoint move = new MovablePoint(10,1,3,3);
        System.out.println("X: "+move.getX()+" Y: "+move.getY());
        move.moveUp();
        System.out.println("X: "+move.getX()+" Y: "+move.getY());
        move.moveDown();
        move.moveLeft();
        System.out.println("X: "+move.getX()+" Y: "+move.getY());
        move.moveRight();
        System.out.println("X: "+move.getX()+" Y: "+move.getY());

    }
}
