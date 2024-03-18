package construct;

import ref.InitData;

public class MemberConstructMain {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("kim", 10, 100);
        MemberConstruct member2 = new MemberConstruct("lee", 20, 90);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println("name: " + m.name + ", age: " + m.age + ", grade: " + m.age);
        }

    }
}



