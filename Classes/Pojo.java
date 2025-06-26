package Classes;

public class Pojo {
    
}

/*
  POJO - Plain old java object

   Is POJO thread-safe?
→ No. If multiple threads access it, you need to handle synchronization manually.

Can POJO have business logic?
→ Preferably no. It should just hold data.

POJO vs Entity class?
→ Entity class is a POJO + JPA annotations like @Entity, @Id, etc.

POJO with Lombok?
→ Using Lombok annotations like @Data, @Getter, @Setter helps auto-generate boilerplate code in POJOs.


 As of now — you're just learning Core Java — so for now, remember this:
POJO (Plain Old Java Object) is just a simple Java class used to hold data, with:

Private fields

Public getters/setters

Optional constructors, toString(), etc.

No framework, no magic, just plain Java — that’s enough to know at this stage 💯




 */