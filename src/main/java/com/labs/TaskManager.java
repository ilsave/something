package com.labs;

import java.util.List;

public class TaskManager {

    private int id;

    public TaskManager(int id) {
        this.id = id;
    }

    private static void printQuery(AcademicPlan plan, String subjectName) {
        SubjectQuery q = plan.query(subjectName);
        System.out.println(String.format("%s {", subjectName));

        // Печатаем входные ЗУНы
        System.out.println("  INPUTS");
        for (SkillQuery sq : q.requiredSkills()) {
            System.out.print("    ");
            System.out.print(sq.skill().toString());

            List<Subject> subjects = sq.subjects();
            if (!subjects.isEmpty()) {
                // Печатаем дисциплины, для которых
                // текущий ЗУН явялется выходным
                System.out.print(" produced by {");
                for (Subject s : subjects) {
                    System.out.print(" ");
                    System.out.print(s.name());
                }
                System.out.print(" }");
            }
            System.out.println();
        }

        // Печатаем выходные ЗУНы
        System.out.println("  OUTPUTS");
        for (SkillQuery sq: q.producedSkills()) {
            System.out.print("    ");
            System.out.print(sq.skill().toString());

            List<Subject> subjects = sq.subjects();
            if (!subjects.isEmpty()) {
                // Печатаем дисциплины, для которых
                // текущий ЗУН явялется входным
                System.out.print(" required by {");
                for (Subject s: subjects) {
                    System.out.print(" ");
                    System.out.print(s.name());
                }
                System.out.print(" }");
            }
            System.out.println();
        }

        System.out.println("}");

    }

}
