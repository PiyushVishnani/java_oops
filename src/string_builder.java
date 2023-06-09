public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //character at index
        System.out.println(sb.charAt(0));

        //set character at index
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //insert at index
        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);

        //delete at index
        sb.delete(2,3);
        sb.delete(0,1);
        System.out.println(sb);

        //changes in same string
        sb.append("h");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}
