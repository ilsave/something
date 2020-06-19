package com.labs;

import java.util.Collection;
import java.util.HashSet;

// Конкретная реализация интерфейса `SkillSet` с помощью
// `HashSet`
public class SkillSetHashed implements SkillSet {
    private HashSet<Skill> _skills;

    SkillSetHashed() {
        _skills = new HashSet<>();
    }

    @Override
    public void add(Skill skill) {
        _skills.add(skill);
    }

    @Override
    public boolean contains(Skill skill) {
        return _skills.contains(skill);
    }

    @Override
    public Collection<Skill> view() {
        return _skills;
    }
}
