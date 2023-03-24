// public class cat {
//     private String name;

//     private double age;

//     private String sex;

//     private boolean vakcine;

//     private double weight;

//     private String color;

//     public cat(String name, double age, String sex) {
//         this.name = name;
//         this.age = age;
//         this.sex = sex;
//         this.color = " белый";
//         this.weight = 8;

//     }

//     public boolean isVakcine() {
//         return vakcine;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getAge() {
//         return age;
//     }

//     public double getWeight() {
//         return weight;
//     }

//     public String getColor() {
//         return color;
//     }

//     public void setVakcine(boolean vakcine) {
//         this.vakcine = vakcine;
//     }

//     public void setAge(double age) {
//         this.age = age;
//     }

//     public void setColor(String color) {
//         this.color = color;
//     }

//     public void setWeight(double weight) {
//         this.weight = weight;
//     }

//     public void setSex(String sex) {
//         this.sex = sex;
//     }

//     public String getSex() {
//         return sex;
//     }

//     public void vac() {
//         if (!this.isVakcine()) {
//             this.setVakcine(true);
//         } else {
//             System.out.println("Кот уже привит!");
//         }
//     }

//     public void meow(int value) {
//         System.out.printf("%s говорит МЯЯЯу %d разa!", this.name, value);

//     }

//     @Override
//     public String toString() {
//         String res = new String();
//         res += "Cat";
//         res += "\nSex=";
//         res += "Male";
//         res += "\nИмя=";
//         res += name;
//         res += "\nВозраст=";
//         res += age;
//         res += "\nВес=";
//         res += weight;
//         res += "\nЦвет=";
//         res += color;
//         if (vakcine) {
//             res += "\nВакцинирован";
//         } else {
//             res += "\nНе привит";
//         }
//         return res;
//     }

// }
