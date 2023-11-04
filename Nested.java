public class Nested {
    public static void main(String[] args) {
    
String string1 = "abc";
String string2 = "def";

for (int i = 0; i < string1.length(); i++) {
  for (int j = 0; j < string2.length(); j++) {
    System.out.println(string1.charAt(i) + string2.charAt(j));
  }
}

    }
    
}