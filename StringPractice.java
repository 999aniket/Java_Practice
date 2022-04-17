public class StringPractice {
    public static void main(String[] args) {
        String fname = "aniket";
        String lname = "chauhan";
        //print sum of length of two string
        System.out.println(fname.length()+lname.length());
        //compare two string lexicographically
        System.out.println(fname.compareTo(lname)>0?"Yes":"No");
        //capitalize first letter of both string
        String a = fname.substring(0, 1).toUpperCase()+fname.substring(1,fname.length());
        String b = lname.substring(0, 1).toUpperCase()+lname.substring(1,lname.length());
        System.out.println(a+" "+b);
    }
}
