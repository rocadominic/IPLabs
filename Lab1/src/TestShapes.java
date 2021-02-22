class TestShapes
{
    public static void main(String[] args)
    {
        System.out.println("Exemplu de clasa abstracta si mostenire:\nOrice obiect mostenit din tipul abstract Shape va afisa la creare mesajul \"Forma geometrica este:\", provenit din constructor.");
        System.out.println("Obiectul de tip Triangle afiseaza initial mesajul din constructorul clasei parinte Shape, si apoi pe cel din constructorul sau.");
        Triangle triangle = new Triangle();
        triangle.setBase(20);

        System.out.println("\nExemplu de interfata:\nOrice obiect de tip Segment implementand interfata Line necesita implementarea metodei printLenght.");
        Segment segment = new Segment(10);
        segment.printLength();

        System.out.println("\nExemplu de polimorfism static:\nMetoda setHeigth a clasei Triangle este supraincarcata astfel incat sa poata accepta fie valori de tip int, fie de tip double.");
        triangle.setHeigth(100);
        System.out.println("Aria triunghiului este " + triangle.getArea() + ".");
        triangle.setHeigth(101.0);
        System.out.println("Aria triunghiului este " + triangle.getArea() + ".");

        System.out.println("\nExemplu de polimorfism dinamic:\nClasa Rectangle suprascrie metoda getArea a clasei Shape, afisand in plus mesajul \"Function override!\".");
        Rectangle rectangle = new Rectangle();
        rectangle.setHeigth(10);
        rectangle.setWidth(10);
        System.out.println("Aria dreptunghiului este " + rectangle.getArea() + ".");
    }
}