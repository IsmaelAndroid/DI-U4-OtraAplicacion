# OtraAplicacion: proyecto 2 (el que importa el componente)

Proyecto de ejemplo de **DI · U4.1 Creación de componentes**, apartado
**8.1 Llevar el componente a otro proyecto, paso a paso**.

Es una app Compose normal que **no tiene el código** de `BadgeEstado`. En clase le
añadimos el componente del proyecto
[DI-U4-IsmaelUIKit](https://github.com/IsmaelAndroid/DI-U4-IsmaelUIKit) empaquetado como `.aar`,
en local y sin copiar ni una línea de su código fuente.

## Ramas

| Rama | Contenido |
|------|-----------|
| `main` | Punto de partida: app sin el componente (`app/libs/` vacía) |
| `solucion` | Resultado final de los 5 pasos de la teoría |

## Los 5 pasos (resumen)

1. En IsmaelUIKit: `./gradlew :ui:assembleRelease` → `ui/build/outputs/aar/ui-release.aar`
2. Copiarlo a `app/libs/` de este proyecto y renombrarlo `uikit-1.0.0.aar`
3. En `app/build.gradle.kts`: `implementation(files("libs/uikit-1.0.0.aar"))` y volver a declarar Compose
4. Sincronizar Gradle y usar el componente en `PantallaExtra.kt`
5. `./gradlew :app:assembleDebug` → `BUILD SUCCESSFUL`
