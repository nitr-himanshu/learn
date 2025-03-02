# VIM

## Update Vim

- sudo add-apt-repository ppa:jonathonf/vim
- sudo apt update
- sudo apt install vim

## Vundle package manager

- Create .vimrc in ~/.vimrc

```vim
set nocompatible
filetype off
set rtp+=~/.vim/bundle/Vundle.vim
call vundle#begin()
Plugin 'VundleVim/Vundle.vim'
Plugin 'tpope/vim-fugitive'
call vundle#end()
filetype plugin indent on
```

## NERDTree

- Add **Plugin 'preservim/nerdtree'** to .vimrc between vundle begin and end

## vim-airline

- Add **Plugin 'vim-airline/vim-airline'** to .vimrc between vundle begin and end

## .vimrc config

- Add these command at the end

|command|usage|comment|
|---|---|---|
|color \<color scheme>|change color scheme|color elflord|
|nmap \<F6> :NERDTreeToggle\<CR>|Toggle NERDTree||
|nmap \<F7> :NERDTreeFind\<CR>|Toggle to current file||
|let g:NERDTreeWinSize=60|NERDTree width||
|nmap \<F10> :vert term bash\<CR>|Start terminal vertically||
|let Tlist_WinWidth=75|Taglist width|C/C++|
|nmap \<F8> :TlistToggle\<CR>|Toggle Taglist|C/C++|

## C/CPP

### Cscope

- sudo apt install cscope
- cd \<proj dir>
- cscope -R -b
- vim
- :cscope add cscope.out

### Taglist

- sudo apt-get intall exuberant-ctags
- Add **Plugin 'taglist.vim'** to .vimrc between vundle begin and end
- cd \<proj dir>
- ctags -R .
