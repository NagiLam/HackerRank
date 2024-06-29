/* This code only works if you submit the code with Java 7.
Other versions like 8 and 15 are broken. My guess is it has something 
to do with the way they append the code to the Student class.
Kinda surprised because this is the first time I've seen a broken problem on Hackerrank.
*/
class Solution {
    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
