package com.labs;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Класс для представления дисциплины
@Component("Subject")
@Scope("prototype")
public class Subject {
    private SkillSet _requiredSkills;
    private SkillSet _producedSkills;
    private String _name;
    static int subject_number = 0;

    public Subject() {
        subject_number ++;
        _requiredSkills = new SkillSetHashed();
        _producedSkills = new SkillSetHashed();
         this._name = "Subject_" + subject_number;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    // Название дисциплины
    String name() {
        return _name;
    }

    // Множество входных ЗУНов
    public SkillSet requiredSkills() {
        return _requiredSkills;
    }

    // Множество выхожных ЗУНов
    public SkillSet producedSkills() {
        return _producedSkills;
    }
}
