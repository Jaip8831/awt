import java.util.ArrayList;
class UserDB{
    private ArrayList<User> users;

    public UserDB(){
        users = new ArrayList<User>();
    }


    public boolean addUser(String name,String email,String mob,String username,String password){
        User newUser =new User(name,email,mob,username,password);
        users.add(newUser);
        System.out.println(users.size());
        return true;
    }



    public User getUser(String userId)

    {
        User getUser;
        for(int i=0;i<users.size();i++)
        {
            if(users.get(i).getUsername()==userId)
            {
                getUser=users.get(i);
                return getUser;
            }
            

        }

        return null;
    }
 
    
}