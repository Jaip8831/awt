class User{
 
       private String name;
       private String email;
       private String mob;
       private String username;
       private String password;

      public User(String name,String email,String mob,String username,String password)
       {
        this.name = name;
        this.email = email;
        this.mob = mob;
        this.username = username;
        this.password = password;
       }

       public String getUsername(){
              return username;
       }
}