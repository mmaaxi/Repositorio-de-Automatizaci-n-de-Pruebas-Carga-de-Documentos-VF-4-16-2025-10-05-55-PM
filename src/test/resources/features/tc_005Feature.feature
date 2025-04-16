Feature: Verificación de formato y contenido del documento cargado

  Scenario: Cargar y abrir un documento PDF para verificar su formato y contenido
    Given el usuario tiene un documento PDF predefinido y conocido
    When el usuario carga el documento PDF en el sistema
    Then el documento debe almacenarse correctamente
    When el usuario abre el documento cargado
    Then el contenido del documento debe ser legible y sin corrupción