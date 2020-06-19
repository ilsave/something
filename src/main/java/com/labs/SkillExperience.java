package com.labs;

// Реализация интерфейса ЗУНа для Навыка
public class SkillExperience implements Skill {
    private SkillSource _source;

    public SkillExperience(SkillSource source) {
        _source = source;
    }

    @Override
    public void visit(SkillVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return String.format("E{%s}",  _source.name());
    }
}
