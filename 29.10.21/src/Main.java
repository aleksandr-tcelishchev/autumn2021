//import java.util.Random;
//
//public class Main{
//    public static void main(String[] args) {
//
//        //System.out.println(NonGeneric.method(new Float(3.9)));
//
//        //        Basket<Fruitable> basket = new Basket<Apple>();//отсутствие ковариантности;
////        Basket<? extends Fruitable> basket2 = method();//ковариантность;
////        Fruitable fruitable = basket2.getValue();
////        basket2.setValue(new Object());
////        Basket<? super Fruitable> basket3 = new Basket<Object>();//контрвариантность;
////        Object fruitable3 = basket3.getValue();
////        basket3.setValue(new Apple());
////
////        Basket basket4 = new Basket();
////        Object value4 = basket4.getValue();
////        basket4.setValue(new Apple());
//
////        Basket<?> basket5 = new Basket<Object>();
////
////        Object value4 = basket5.getValue();
////        basket5.setValue(new Object());
////        basket.setValue(new Apple());
////        System.out.println(basket.getValue());
////        Basket<Number> basket2 = new Basket<>();
////        basket2.setValue(123);
////        System.out.println(basket2.getValue());
////                Basket<Apple> basket = new Basket<>();
////        basket.setValue(new Apple());
////        Basket basket2 = basket;
////        Basket<Orange> basket3 = basket2;
////
////        basket3.getValue().method3();
//
//    }
//
////    public static Basket<? extends Fruitable> method(){
////        if(new Random().nextInt()%2 == 0){
////            return new Basket<Apple>();
////        } else {
////            return new Basket<Orange>();
////        }
////    }
//}
//
//class Basket<T extends Number>{
//    private T value;
//
//    public Basket(T value) {
//        this.value = value;
//    }
//
//    public T getValue() {
//        T apple = value;
//        this.value = null;
//        return apple;
//    }
//
//    public T setValue(T value) {
//        T apple = this.value;
//        this.value = value;
//        return apple;
//    }
//}
//
//class NonGeneric<T extends Number>{
//    private T value;
//    public <T> int method(T t){
//        new T();
//        return 123;
//    }
//}
//
//class Fruitable{
//    void fruitMethod(){};
//}
//class Apple extends Fruitable{
//    public void method(){};
//    public void method2(){};
//
//    @Override
//    public void fruitMethod() {
//
//    }
//}
//class Orange extends Fruitable{
//    @Override
//    public void fruitMethod() {
//
//    }
//    public void method3(){};
//    public void method4(){};
//    public void method5(){};
//}
