class test {
    static int c;

    public static void main(String[] args) {
        try {
            c = 5 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}