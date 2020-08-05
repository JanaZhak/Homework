class Circle{

           private double x; // абсцисса центра
        private double y; // ордината центра
        private double radius; //радиус

    public interface Figure {
        void draw();
        double getArea();
      }

        public void Circle (double r){
        this.radius = r;
    }


    public void draw() {
        System.out.println("Рисуем круг");
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius; // Вычисляем площадь
    }

    public double getRadius(){
        return this.radius;
    }
    

        public static void main(String[] args) {
            // реализуем интерфейс
            Circle one = new Circle(5) {

                public void draw() {
                    System.out.println("Рисуем круг");
                }


            };

            one.draw();
            System.out.println("Площадь = " + one.getArea());

        }

}
