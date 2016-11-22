public class Initials{
    private String name;
    public Initials (String n)
        {
            name = n;
        }
        public String getName()
        {
            return name;
        }
        public void setName(String n)
        {
            this.name = n;
        }
        public void displayInitials()
        {
            String[] initials = name.split(" ");
            char first = initials[0].charAt(0);
            char second = initials[1].charAt(0);
            char third = initials[2].charAt(0);
            System.out.println(first + "." + second + "." + third + ".");
        }

}

