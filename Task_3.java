

interface Figure {
    double perimeter();
    double squareSide();
}


 class Circle implements Figure {

    private double r; //радиус

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

     @Override
     public double squareSide() {
         return 0;
     }


 }
class Square implements Figure{
    private int a;
    private int b;

    public Square (int a, int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double perimeter() {
        return 2*(a+b);
    }

        @Override
    public double squareSide() {
        return a*b;
    }

        public static void main(String[] args) {
        // реализуем интерфейс
        Figure circle = new Circle(5);
        Figure square=new Square(1,2);
            System.out.println(circle.perimeter());
            System.out.println(square.perimeter());



               }

}



//        3.Создайте интерфейс, который представляет геометрическую фигуру.
//        Сделайте так, чтобы класс Circle реализовывал ваш интерфейс.
//        Создайте класс Квадрат, который тоже реализует интерфейс Геометрическая фигура.
//        Поместите в переменную типа Фигура сначала круг, и вызовите несколько методов.
//        Потом поместите в нее квадрат, и вызовите несколько методов. Какие принципы ООП вы использовали в этом задании?
