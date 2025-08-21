package AdvJava.Project1Quiz;

import java.util.Scanner;

public class QuestionService {
         
       String[] select = new String[5];
       
      Question[] questions = new Question[5];

    public QuestionService(){
          questions[0] = new Question(1,"size of Short ","2","4","6","8","2");
          questions[1] = new Question(2,"size of Int ","2","4","6","8","4");
          questions[2] = new Question(3,"size of Double ","2","4","6","8","8");
          questions[3] = new Question(4,"size of Float ","2","4","6","8","4");
          questions[4] = new Question(5,"size of Byte ","1","4","6","8","1");
    }

    public void palyQuiz(){
                int i=0;
            for(Question q : questions){

                System.out.print("Q.No:"+q.getId()+" ");
                System.out.println(q.getQuestion());
                System.out.print("A."+q.getOpt1()+", ");
                System.out.print("B."+q.getOpt2()+", ");
                System.out.print("C."+q.getOpt3()+", ");
                System.out.println("D."+q.getOpt4()+". ");
                System.out.println("Answer : ");

                Scanner sc = new Scanner(System.in);
                select[i++] = sc.nextLine();

                System.out.println("");

            }
                System.out.print("Your Ans : ");
                for(String s : select)
                    System.out.print(s+" ");
        
    }

      public void scoreOfQuiz(){
          int score = 0;
           for(int i=0;i<questions.length;i++){
                Question que = questions[i];
                String atualAns = que.getAnswer();
                String userAns = select[i];

                if(atualAns.equals(userAns))
                   score++;
           }
           System.out.println(" ");
           System.out.println("Your Score is : "+score);
      }
}
