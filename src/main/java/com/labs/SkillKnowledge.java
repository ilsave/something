package com.labs;

// Реализация интерфейса ЗУНа для Знания
public class SkillKnowledge implements Skill {
    private SkillSource _source;

    public SkillKnowledge(SkillSource source) {
        _source = source;
    }

    @Override
    public void visit(SkillVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return String.format("K{%s}",  _source.name());
    }
}
