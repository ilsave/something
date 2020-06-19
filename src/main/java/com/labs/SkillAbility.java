package com.labs;

// Реализация интерфейса ЗУНа для Умения
public class SkillAbility implements Skill {
    private SkillSource _source;

    // `SkillSource` это интерфейс, нужный для реализации паттерна СТРАТЕГИЯ
    // в ЗУНах. `SkillSource` передаёт имя для этого ЗУНа, сделано для расширяемости,
    // чтобы было возможно передавать не только строку имени, а например XML,
    // как требуется в задании
    // В классах `SkillExperience`, `SkillKnowledge` используется такой же подход
    public SkillAbility(SkillSource source) {
        _source = source;
    }

    @Override
    public void visit(SkillVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return String.format("A{%s}",  _source.name());
    }
}
