class ThreeGen<T, V, W> {
T ob1;
V ob2;
W ob3;
ThreeGen(T o1, V o2, W o3) {
ob1 = o1;
ob2 = o2;
ob3 = o3;
}
void showTypes() {
System.out.println("Type of T is " +ob1.getClass().getName());
System.out.println("Type of V is " +ob2.getClass().getName());
System.out.println("Type of W is " +ob3.getClass().getName());
}
T getob1() {
return ob1;
}
V getob2() {
return ob2;
}
W getob3() {
return ob3;
}
}
class SimpGen {
public static void main(String args[]) {
ThreeGen<Integer, String, Double> tgObj =
new ThreeGen<Integer, String, Double>(88, "Generics", 22.4);
tgObj.showTypes();
int v = tgObj.getob1();
System.out.println("value: " + v);
String str = tgObj.getob2();
System.out.println("value: " + str);
double f = tgObj.getob3();
System.out.println("value: " + f);
}
}