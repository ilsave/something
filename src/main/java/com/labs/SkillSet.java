package com.labs;

import java.util.Collection;

// Интерфейс который представляет множество ЗУНов
// Дисциплина (`Subject`) использует этот интерфейс, чтобы
// предсталять множество входных и выходных зунов
public interface SkillSet {
    void add(Skill skill);
    boolean contains(Skill skillSet);
    Collection<Skill> view();
}
