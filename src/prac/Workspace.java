/*
package prac;

interface father {
}

interface mother {
}

interface programmer {
    public void coding();
    public void add(int a);

    public int add2(int a);

}

interface believer {
}

class Steve implements father, programmer, believer {
    @Override
    public void coding() {
        System.out.println("fast");
    }

    @Override
    public void add(int a) {
        System.out.println(a + 1);
    }

    @Override
    public int add2(int a) {

        return 10;
    }

    public boolean login(String id, String pw) {

      User user  = loginRepository.findById(id);

      if (user == null){
          System.out.println("유저정보가 없다.");
      }

        if (id.equals("성빈") && pw.equals("1234")) {
            return true;
        }

        return false;
    }

}

class Rachel implements mother, programmer {
    @Override
    public void coding() {
        System.out.println("elegance");
    }

    @Override
    public void add(int a) {

    }

    @Override
    public int add2(int a) {
        return 0;
    }


}


public class Workspace {

    public static void main(String[] args) {
        Steve steve1 = new Steve();
        Steve steve2 = new Steve();

        int result = steve1.add2(10);
        if (result == 1) {

        }

        boolean result2 = steve.login("성빈", "1234");
    }
}

*/
