package com.labs;


public interface SkillVisitor {
    void visit(SkillKnowledge knowledge);
    void visit(SkillAbility ability);
    void visit(SkillExperience experience);
}
