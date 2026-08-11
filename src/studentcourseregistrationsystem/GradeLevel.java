
package studentcourseregistrationsystem;

public enum GradeLevel {
    
    FRESHMAN(1),
    SOPHOMORE(2),
    JUNIOR(3),
    SENIOR(4);

    
    private final int code;

    GradeLevel(int code){
        this.code=code;
    }
     
    public int getCode(){
        return code;
    }    

    public static GradeLevel fromCode(int code){
        for(GradeLevel level : GradeLevel.values()){
            if(level.getCode() == code){
                return level;
            }
        }
        throw new IllegalArgumentException("Invalid grade level code: " + code);    }    
}




    