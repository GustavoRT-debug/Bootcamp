import React, { useState } from "react";
import useGithub from "../../hooks/github-hooks";
import * as S from "./styled";

const Search = () => {
  const { getUser } = useGithub();
  const [username, setUsername] = useState("");

  const handleSearch = () => {
    if (!username) return;
    getUser(username);
  };

  return (
    <S.Wrapper>
      <input
        type="text"
        placeholder="Digite um usuário do GitHub"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />
      <button onClick={handleSearch}>Pesquisar</button>
    </S.Wrapper>
  );
};

export default Search;
