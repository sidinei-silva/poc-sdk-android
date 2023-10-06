# Arquitetura do Projeto

Neste documento, apresentamos a arquitetura e estrutura do projeto, que foi projetada para ser modular e escalável. A arquitetura adota uma abordagem de "Feature Modularization", onde cada funcionalidade é autocontida e pode ser reutilizada tanto pelo app principal quanto pelo SDK.

## Estrutura do Projeto

A estrutura do projeto é organizada da seguinte forma:

```bash
📂 [root_project_directory]
│
├── 📂 app # Diretório principal do aplicativo
│ ├── 📂 di # Injeção de dependência (Dagger2, Hilt, Koin, etc.)
│ ├── 📂 ui # Componentes de UI genéricos e reutilizáveis
│ │ ├── 📂 activities # Atividades principais e base do aplicativo
│ │ ├── 📂 fragments # Fragmentos principais e base do aplicativo
│ │ └── 📂 views # Componentes de visualização personalizados
│ └── 📂 utils # Funções utilitárias e helpers
├── 📂 sdk # Diretório principal do SDK
│ ├── 📂 config # Configurações do SDK, incluindo temas
│ ├── 📂 render # Classes e métodos para renderizar funcionalidades ou o app inteiro
│ └── 📂 utils # Funções utilitárias e helpers específicos do SDK
├── 📂 features # Funcionalidades modulares reutilizáveis
│ ├── 📂 login
│ │  ├── 📂 data # Repositórios, fontes de dados e modelos para a funcionalidade de login
│ │  ├── 📂 domain # Entidades, use cases e regras de negócio para a funcionalidade de login
│ │  └── presentation # Fragmentos, viewmodels e componentes de UI para a funcionalidade de login
│ ├── 📂 userProfile
│ │  ├── 📂 data # Repositórios, fontes de dados e modelos para a funcionalidade de perfil de usuário
│ │  ├── 📂 domain # Entidades, use cases e regras de negócio para a funcionalidade de perfil de usuário
│ │  └── 📂 presentation # Fragmentos, viewmodels e componentes de UI para a funcionalidade de perfil de usuário
├── 📂 common # Componentes e utilitários comuns compartilhados entre o aplicativo, SDK e funcionalidades
│ ├── 📂 helpers # Funções auxiliares comuns
│ ├── 📂 i18n # Internacionalização (Strings.xml, etc.)
│ ├── 📂 theme # Temas e estilos padrão do aplicativo
│ └── 📂 assets # Ativos relacionados ao tema, como imagens e ícones
```

## Diagrama da Arquitetura

Aqui está um diagrama simplificado da arquitetura:

```bash
+---------------------+
| root_project        |
|                     |
|  +--------------+   |
|  |     app      |   |
|  +--------------+   |
|                     |
|  +--------------+   |
|  |     sdk      |   |
|  +--------------+   |
|                     |
|  +--------------+   |
|  |   features   |   |
|  +--------------+   |
|                     |
|  +--------------+   |
|  |    common    |   |
|  +--------------+   |
+---------------------+
```

## Descrição das Pastas

- **app**: Diretório principal do aplicativo. Contém componentes de UI, injeção de dependência e utilitários específicos do app.
- **sdk**: Diretório principal do SDK. Contém configurações, renderização e utilitários específicos do SDK.
- **features**: Funcionalidades modulares reutilizáveis. Cada funcionalidade é autocontida e tem suas próprias camadas de `data`, `domain` e `presentation`.
- **common**: Componentes e utilitários comuns compartilhados entre o aplicativo, SDK e funcionalidades.

## Conclusão

A arquitetura adotada permite uma separação clara de responsabilidades e facilita a manutenção e expansão do projeto. A abord
