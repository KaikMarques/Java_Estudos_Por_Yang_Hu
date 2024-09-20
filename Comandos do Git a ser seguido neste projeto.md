Aqui está o texto formatado para você adicionar diretamente ao seu `README.md`:

```markdown
## Criando uma nova branch e mesclando com a main no Git

Aqui estão os passos para criar uma nova branch, trabalhar nela e depois fazer o merge com a branch `main`.

### Passos:

1. **Verifique se você está na branch `main`:**

   Use o comando abaixo para garantir que você está na branch `main`:

   ```bash
   git checkout main
   ```

   Caso esteja em outra branch, esse comando vai te mover para a branch `main`.

2. **Crie uma nova branch:**

   Para criar uma nova branch, use o comando `git checkout -b` seguido do nome da nova branch que deseja criar. Vamos supor que você queira chamar sua branch de `minha-branch`.

   ```bash
   git checkout -b minha-branch
   ```

   Esse comando cria e automaticamente muda para a nova branch `minha-branch`.

3. **Faça suas alterações na nova branch:**

   Agora que você está na branch `minha-branch`, pode fazer todas as modificações necessárias no seu código. Adicione os arquivos que você alterou ao stage com o seguinte comando:

   ```bash
   git add .
   ```

4. **Faça commit das alterações:**

   Depois de adicionar os arquivos, faça o commit com uma mensagem descritiva:

   ```bash
   git commit -m "Descrição das alterações feitas"
   ```

5. **Envie sua branch para o repositório remoto:**

   Para enviar a nova branch criada para o GitHub (ou outro repositório remoto), use o comando `git push` com o nome da branch:

   ```bash
   git push origin minha-branch
   ```

6. **Volte para a branch `main`:**

   Após terminar suas modificações na branch `minha-branch` e fazer o push, volte para a branch `main`:

   ```bash
   git checkout main
   ```

7. **Atualize a branch `main`:**

   Antes de fazer o merge, é importante garantir que sua branch `main` está atualizada com o repositório remoto:

   ```bash
   git pull origin main
   ```

8. **Faça o merge da sua branch com a branch `main`:**

   Agora que você está na branch `main` e ela está atualizada, faça o merge da sua branch `minha-branch` na branch `main`:

   ```bash
   git merge minha-branch
   ```

   Isso vai incorporar as mudanças da branch `minha-branch` na branch `main`.

9. **Envie as alterações para o repositório remoto:**

   Após o merge, envie as mudanças da branch `main` para o repositório remoto:

   ```bash
   git push origin main
   ```

10. **(Opcional) Apague a branch `minha-branch`:**

    Se a branch `minha-branch` não for mais necessária, você pode deletá-la localmente e no repositório remoto.

    Para deletar localmente:

    ```bash
    git branch -d minha-branch
    ```

    Para deletar no repositório remoto:

    ```bash
    git push origin --delete minha-branch
    ```

---

### Resumo dos Comandos:

1. `git checkout main` – Certifique-se de que está na branch `main`.
2. `git checkout -b minha-branch` – Crie e troque para uma nova branch.
3. `git add .` – Adicione seus arquivos ao stage.
4. `git commit -m "Descrição das alterações feitas"` – Faça commit das alterações.
5. `git push origin minha-branch` – Envie a branch para o repositório remoto.
6. `git checkout main` – Volte para a branch `main`.
7. `git pull origin main` – Atualize a branch `main`.
8. `git merge minha-branch` – Faça o merge da branch com a `main`.
9. `git push origin main` – Envie as mudanças para o repositório remoto.
