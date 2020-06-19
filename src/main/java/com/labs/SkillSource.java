package com.labs;

// Интерфейс, нужный для реализации паттерна СТРАТЕГИЯ в ЗУНах.
// По сути сейчас есть только одна реализация этого интерфейса через
// класс `SkillSourceText`
public interface SkillSource {
    String name();
}
