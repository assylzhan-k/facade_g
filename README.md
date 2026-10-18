
# RPG Battle System — Facade Pattern

## Description
This project demonstrates the Facade Design Pattern in Java using a simple RPG battle system.

The Facade Pattern provides a simple interface to a complex subsystem.

In this project, BattleFacade coordinates different systems to perform a battle.

## Design Pattern
- Pattern: Facade
- Type: Structural Design Pattern
- Language: Java

## Project Structure

```text
RPGFacadePattern/
└── src/
    ├── Main.java
    ├── BattleFacade.java
    ├── CharacterSystem.java
    ├── SkillSystem.java
    ├── ElementSystem.java
    ├── DamageSystem.java
    └── RewardSystem.java
```

## Classes

- **Main** — Client that uses the Facade.
- **BattleFacade** — Coordinates the battle process.
- **CharacterSystem** — Checks character health.
- **SkillSystem** — Manages skill energy.
- **ElementSystem** — Calculates elemental bonus damage.
- **DamageSystem** — Calculates and applies damage.
- **RewardSystem** — Calculates rewards after victory.

## How It Works

1. Main calls the BattleFacade.
2. CharacterSystem checks player health.
3. SkillSystem checks and consumes energy.
4. ElementSystem calculates bonus damage.
5. DamageSystem calculates and applies damage.
6. RewardSystem calculates the reward.

The client communicates only with BattleFacade.

## Code Example

<img width="552" height="176" alt="Screenshot 2026-10-18 at 20 43 43" src="https://github.com/user-attachments/assets/7f4ce7b9-766a-402d-bbe6-d003919bd1fc" />

## Output

<img width="552" height="215" alt="Screenshot 2026-10-18 at 20 46 27" src="https://github.com/user-attachments/assets/6110cfe7-eaeb-4ce9-ba1e-63340901b631" />

## Clean Code Principles

1. **Meaningful Names** — Classes and methods have clear names.
2. **Single Responsibility Principle** — Each class has one responsibility.
3. **Encapsulation** — Subsystem objects are private in BattleFacade.
4. **DRY Principle** — Battle coordination logic is not repeated in the client.
5. **Separation of Concerns** — Each subsystem handles a different part of the battle.
