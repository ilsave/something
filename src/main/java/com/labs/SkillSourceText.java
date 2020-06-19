package com.labs;

// Реализация интерфейса `SkillSource` которая задаётся с помощью строки
public class SkillSourceText implements SkillSource {
    private String _name;

    public SkillSourceText(String name) {
        _name = name;
    }

    @Override
    public String name() {
        return _name;
    }
}
