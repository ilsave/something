package com.labs;

import java.util.List;
import java.util.ArrayList;

// Вспомогательный класс -- структура которая хранит
// взаимосвязь между ЗУНами и дисциплиной. Используется для печати
public class SubjectQuery {
    private Subject _subject;
    private ArrayList<SkillQuery> _requiredSkills;
    private ArrayList<SkillQuery> _producedSkills;

    SubjectQuery(Subject subject) {
        _subject = subject;
        _requiredSkills = new ArrayList<>();
        _producedSkills = new ArrayList<>();
    }

    void addRequired(SkillQuery sq) {
        _requiredSkills.add(sq);
    }

    void addProduced(SkillQuery sq) {
        _producedSkills.add(sq);
    }

    List<SkillQuery> requiredSkills() {
        return _requiredSkills;
    }

    List<SkillQuery> producedSkills() {
        return _producedSkills;
    }
}
